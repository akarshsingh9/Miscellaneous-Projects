from pytube import YouTube

def audio(link,path):
     yt = YouTube(link)  
     try: 
        #downloading the video 
        yt.streams.filter(only_audio=True).first().download(path) 
     except: 
        print("Exception caught") 


s = input()
p = input()
#raw path
path = r'%s'%p
#print(path)
audio(s,path)