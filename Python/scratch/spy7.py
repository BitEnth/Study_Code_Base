#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  4 10:35:05 2019

@author: mintaro
"""

#import urllib.request
import requests
url = "https://www.bilibili.com"
#header = ("User-Agent","Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:64.0) Gecko/20100101 Firefox/64.0")
header = {"User-Agent":"Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:64.0) Gecko/20100101 Firefox/64.0"}
try:
    data = requests.get(url,headers=header)
    file = open("/home/mintaro/Desktop/scratch/spy7t.html","wb")
    file.write(data.content)
    file.close()
except Exception as e:
    print(str(e))

