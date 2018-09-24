from twitter import *
import os
import psutil

def clear():
    if psutil.POSIX:
        os.system('clear')
    else:
        os.system('cls')

def Tweet():

    apikey = 'oGJbZ0DOIf5w9uQgr0XziTaNK'
    apisecret = 'Q6McYFYEWN2AZZGZ4R5AOXNraPKN4ptQ7x2FZBDH3FFyYNdeGc'

    MY_TWITTER_CREDS = os.path.expanduser('~/.my_app_credentials')
    if not os.path.exists(MY_TWITTER_CREDS):
        oauth_dance("asor", apikey, apisecret,
                    MY_TWITTER_CREDS)

    oauth_token, oauth_secret = read_token_file(MY_TWITTER_CREDS)

    twitter = Twitter(auth=OAuth(oauth_token, oauth_secret, apikey, apisecret))

    clear()
    
    tweet = input('Enter your tweet: ')
    twitter.statuses.update(status=tweet)

#testpythonacc
#1239
Tweet()