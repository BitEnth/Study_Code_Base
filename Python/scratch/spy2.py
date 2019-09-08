#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Sep  1 15:38:25 2019

@author: mintaro
"""

import re
string='<a class="f-fcgreen" href="mailto:service@icourses.cn">service@icourses.cn</a>'
pat='<a class="f-fcgreen" href="mailto:(.*)">(.*)</a>'
rst=re.findall(pat,string)
print(rst)