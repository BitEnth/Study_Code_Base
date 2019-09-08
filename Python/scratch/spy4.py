#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  3 15:31:52 2019

@author: mintaro
"""

import urllib.request
keyword=urllib.request.quote("华南理工大学")
#keyword="华南理工大学"
url="http://www.baidu.com/s?wd="+keyword
data=urllib.request.urlopen(url).read()
file=open("/home/mintaro/Desktop/scratch/spy4t.html","wb")
file.write(data)
file.close()