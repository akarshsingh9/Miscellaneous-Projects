from pytube import Playlist

def playlistDownload(link,path):
    pl = Playlist(link)
    pl.download_all(path)

link = input()
p = input()
#raw path
path = r'%s'%p
playlistDownload(link,path)
