import requests
import json
import sys

apiKey = "AIzaSyAuVJ0zfUmacDG5Vie4Jl7_ercv6gSwebc"
GOOGLE_URL_SHORTENER_API_KEY = "AIzaSyCBAXe-kId9UwvOQ7M2cLYR7hyCpvfdr7w"
apiEndPoint  = 'https://firebasedynamiclinks.googleapis.com/v1/shortLinks?key='
URL = apiEndPoint+apiKey
head = {'Content-Type': 'application/json'}
domain = "yodacli.page.link"

def urlShorten(link):
    dataValue = json.dumps({"dynamicLinkInfo": {"dynamicLinkDomain": domain,"link": link }})
    try:
        r = requests.post(url = URL,data = dataValue,headers=head)
        data = r.json()
        return data['shortLink']
    except requests.exceptions.ConnectionError:
        print("Exception found")



def url_expand(url_to_be_expanded):
    """
    expander
    :param url_to_be_expanded:
    """
    try:
        r = requests.get(
            'https://www.googleapis.com/urlshortener/v1/url?key=' + GOOGLE_URL_SHORTENER_API_KEY +
            '&shortUrl=' + url_to_be_expanded)
    except requests.exceptions.ConnectionError:
        print("Exception found")
        #click.echo('Yoda cannot sense the internet right now!')
        #sys.exit(1)

    data = r.json()
    res = data['longUrl']
    if domain in data['longUrl']:
        res = data['longUrl'].split('=')[1]
        res = res[:-3]    
    response = 'Here\'s your original URL:\n' + res
    return response



s = sys.stdin.readline()
small = urlShorten(s)
print(small)
long = url_expand(small)
print(long)
#print(long.split('=')[1])