#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  3 15:11:02 2019

@author: mintaro
"""

import urllib.request
keyword="fuck"
url="http://www.baidu.com/s?wd="+keyword
#req=urllib.request.Request(url)
data=urllib.request.urlopen(url).read()
file=open("/home/mintaro/Desktop/scratch/spy3t.html","wb")
file.write(data)
file.close()