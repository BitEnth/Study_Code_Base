#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  4 15:38:18 2019

@author: mintaro
"""

import urllib.request
import re
url_i="https://blog.csdn.net"
url_pat='<a href="(https://blog.csdn.net/.*?/article/details/\d*)" target="_blank"'
data_i=urllib.request.urlopen(url_i).read()
data_str=str(data_i, "utf-8")
url_essay=re.findall(url_pat,data_str)
#url_essay=set(url_essay)
file=open("/home/mintaro/Desktop/csdn/essay.txt","w")
for j in url_essay:
    j=j+"\n"
    file.write(j)
file.close()
for i in range(1,15):
    try:
        print(i)
        if(url_essay[i] == url_essay[i-1]):
            continue
        else:
            file_path="/home/mintaro/Desktop/csdn/"+str(i)+".html"
            urllib.request.urlretrieve(url_essay[i], file_path)
    except Exception as e:
        print(str(e))
