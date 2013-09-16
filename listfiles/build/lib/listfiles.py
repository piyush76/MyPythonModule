__author__ = 'piyush'

import os
import datetime as dt

now=dt.datetime.now()
ago=now-dt.timedelta(minutes=300)
folder="/home/piyush/linuxworkspace/tmp"
f = open('/home/piyush/linuxworkspace/tmp/file.txt', 'w')
for root,dirs,files in os.walk(folder):
    for fname in files:
        path=os.path.join(root,fname)
        st=os.stat(path)
        mtime=dt.datetime.fromtimestamp(st.st_mtime)
        if mtime>ago:
            print('%s modified %s'%(path,mtime))
            f.write(str(path) +" " + "modified " + str(mtime)+ "\n" )


f.close()



