#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  3 15:39:11 2019

@author: mintaro
"""

import urllib.request
import urllib.parse
url="https://www.iqianyue.com/mypost"
data=urllib.parse.urlencode({
        "name":"daddy",
        "pass":"amdyes"
        }).encode("utf-8")
#req=urllib.request.Request(url,data)
#dback=urllib.request.urlopen(req).read()
dback=urllib.request.urlopen(url,data).read()
file=open("/home/mintaro/Desktop/scratch/spy5t.html","wb")
file.write(dback)
file.close()