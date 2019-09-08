#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep  6 11:21:20 2019

@author: mintaro
"""

import urllib.request
import re

def list2num(list, num):
    for i in list:
        num.add(int(i))
    return num

url_main = "https://www.meituri.com"
pat_main = '<a href="https://www.meituri.com/a/(\d*)/" target="_blank">'
pat_piccount = '<span class="shuliang">(\d*)P</span>'

data_main = urllib.request.urlopen(url_main).read()
data_main = str(data_main)
data_num = re.findall(pat_main,data_main)
pic_datanum = re.findall(pat_piccount, data_main)

#pic_num: the amount of every figures group
pic_num = set()
pic_num = list2num(pic_datanum, pic_num)
pic_num = list(pic_num)

#remove the repeating number
#data_num_set: the number of every figures group
data_num_set = set()
for data_i in data_num:
    data_num_set.add(data_i)
fg_num = list(data_num_set)

for i in range(0,len(fg_num)):
    url_fig = 'https://ii.hywly.com/a/1/' + str(fg_num[i])
    str_temp = str(fg_num[i]) + "-----" + str(pic_num[i])
    print(str_temp)
    for j in range(1,pic_num[i]):
        url_figtemp = url_fig + '/' + str(j) + '.jpg'
        print(url_figtemp)
        try:
            file_path = "/home/mintaro/Desktop/mzt/" + str(i) + str(j) + ".jpg"
            urllib.request.urlretrieve(url_figtemp,file_path)
        except Exception as e:
            print(str(e))

        