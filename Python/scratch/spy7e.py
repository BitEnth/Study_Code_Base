#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  4 10:59:31 2019

@author: mintaro
"""

import urllib.request
url = "https://www.bilibili.com"
header = ("User-Agent","Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:64.0) Gecko/20100101 Firefox/64.0")
o = urllib.request.build_opener()
o.addheaders=[header]
try:
    data = o.open(url).read()
    file = open("/home/mintaro/Desktop/scratch/spy7et.html","wb")
    file.write(data)
    file.close()
except Exception as e:
    print(str(e))
