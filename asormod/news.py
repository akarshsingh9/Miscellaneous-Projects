import requests
import json
import sys

apiKey = '59f3471779b0400b8d99de8a298673e2'
newsURL = 'https://newsapi.org/v2/top-headlines?country=us&apiKey='+apiKey

def news():
    try:
        r = requests.get(newsURL)
        d = r.json()
        if d['status'] != 'error':
            #print(d)
            # aritcles is the json array, 0,1,2 obj indices - different articles, then access other dict elements
            for i in range(int(d['totalResults']/5)):
                print('Source: ',d['articles'][i]['source']['name'])
                print('Title: ',d['articles'][i]['title'])
                print('Description: ',d['articles'][i]['description'])
        else:
            print(d['code'])
            print(d['message'])
    except:
        print("Exception found")


news()
