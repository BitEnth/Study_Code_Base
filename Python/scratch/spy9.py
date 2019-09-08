#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 10:52:42 2019

@author: mintaro
"""

import urllib.request

def connect_proxy(url,proxy_ip):
    proxy = urllib.request.ProxyHandler({"http":proxy_ip})
    opener = urllib.request.build_opener(proxy,urllib.request.HTTPHandler)
    urllib.request.install_opener(opener)
    try:
        data = urllib.request.urlopen(url).read()
        data = data.decode("utf-8")
        print("Success")
    except Exception as e:
        data = "NULL"
        print(str(e))
    return data

url = "https://blog.csdn.net"
#www.xicidaili.com
proxy_ip = "1.198.72.113:9999"
data = connect_proxy(url,proxy_ip)
print(len(data))