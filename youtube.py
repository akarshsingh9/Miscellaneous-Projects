import sys
from pytube import YouTube

def ytDownload(link,path):
    #Youtube obj
    yt = YouTube(link)  
    try: 
        #downloading the video 
        yt.streams.first().download(path) 
    except: 
        print("Exception caught") 


s = sys.stdin.readline()
p = input()
#raw path
path = r'%s'%p
#print(path)
ytDownload(s,path)
