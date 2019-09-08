#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep  1 11:33:17 2019

@author: mintaro
"""
import urllib.request
import re
pat='<div class="name">(.*?)</div>'
data=urllib.request.urlopen("https://read.douban.com/provider/all").read()
data=data.decode('utf-8')
str_data=str(data)
#str_data=str(data,'utf-8')
#print(str_data)
string=re.compile(pat).findall(str_data)
#print(string)
file_path='/home/mintaro/Desktop/scratch/spy1t.txt'

try:
    file_write=open(file_path,'w')
    for i in string:
        file_write.write(i+"\n")
    file_write.close()
    print("Finish")
except Exception as error:
    print(error)