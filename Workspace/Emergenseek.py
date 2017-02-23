from flask import Flask
from flask_ask import Ask, statement, question, session
import json
import requests
import time
import unidecode
import os

app = Flask(__name__)
ask = Ask(app, "/emergenseek")

@app.route('/')
def homepage():
    return "Hello World"

illnesses = [('Geographic tongue', 'burning'), ('Acid Reflux', 'Chest Pain')]
(illness, symptom) = illnesses

@ask.launch
def start_skill():
    welcome_message = 'Hey there, do you want to start Emergenseek?'
    return question(welcome_message)
    
@ask.intent("PossibleIllnessSymptom")
def possible_illness_intent(symptom):
    msg = 'Possible illnesses for that symptom are ' + illness 
    return msg

@ask.intent("GetSymptomsIntent")
def get_symptoms_intent(drug):

  search_payload = {'format': 'json', 'q': drug, 'ds': 'Standard Reference', 'max': '1', 'api_key': 'yxOd4jJkwN5f1mxulTA8I6HYfAjt2ysicEEMR7jA'}
  search_request = requests.get('https://api.fda.gov', params = search_payload)
  print (search_request.url)
  searchresults = json.loads(search_request.text)
  drugnbdno = searchresults['list']['item'][0]["ndbno"]
  payload = {'ndbno': drugnbdno, 'type': 'b', 'format': 'json', 'api_key': 'yxOd4jJkwN5f1mxulTA8I6HYfAjt2ysicEEMR7jA'}
  request = requests.get('https://api.fda.gov', params = payload)
  print(request.url)


  speech_text = "The patient should take the drug for around a ".format()
  return statement(speech_text)
    #send to database
    
@ask.intent("NoIntent")
def no_intent():
    bye_text = 'Ok then, I''m here when you need me!'
    return statement(bye_text)

@ask.intent("YesIntent")
def yes_intent():
    msg = 'Awesome! Ask me about your symptoms and we''ll begin!'
    return statement(msg)
    
app.run(host=os.getenv('IP', '0.0.0.0'),port=int(os.getenv('PORT', 8080)))

if __name__ == '__main__':
    app.run()
    app.run(debug=True)