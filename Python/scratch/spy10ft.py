#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep  6 11:48:46 2019

@author: mintaro
"""

import re
string = '<span class="shuliang">115P</span>'
pat = '<span class="shuliang">(\d*)P</span>'
rst = re.findall(pat, string)
for i in rst:
    print(int(i))