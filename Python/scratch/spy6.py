#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  3 16:07:24 2019

@author: mintaro
"""

import urllib.error
import urllib.request
url="https://www.bilibili.com"
try:
    data=urllib.request.urlopen(url)
    print("Yes")
except urllib.error.URLError as e:
    if(hasattr(e,"code")):
        print(e.code)
    if(hasattr(e,"reason")):
        print(e.reason)
    else:
        print(str(e))
