SplitLayout
===============

Android SplitLayout, which splits the available space between two child views by dragging the center handle.
SplitLayout, 安卓分栏布局，包含2个子View，支持横向或纵向分栏，可通过拖动中间的handle来动态分割两个子View所占空间。 

Screenshots 
-----

![SplitLayout](https://raw.github.com/Mixiaoxiao/SplitLayout/master/SplitLayout.gif) 

Sample APK
-----

[SplitLayoutSample.apk](https://raw.github.com/Mixiaoxiao/SplitLayout/master/SplitLayoutSample.apk)

Features 特性
-----

* Orientation : horizontal / vertical | 支持横向或纵向分栏
* Split : child min size / initial split fraction | 支持设置子View的最小大小与初始分割比例
* Handle : drawable / size / hapticFeedback | 支持设置Handle的drawable/大小/是否触摸反馈

Attrs 属性
--------

|attr|format|description|default|
|---|:---|:---|:---:|
|splitOrientation|enum|horizontal or vertical|horizontal|
|splitChildMinSize|dimension|child min size|32dp|
|splitFraction|float|initial split fraction|0.5|
|splitHandleDrawable|reference|handle drawable|a StateListDrawable with pressed state|
|splitHandleHapticFeedback|boolean|enable handle hapticFeedback|false|

Developed By
------------

* Mixiaoxiao - <xiaochyechye@gmail.com> or <mixiaoxiaogogo@163.com>
* Coding blogs is shit. I just code my codes.


License
-----------

    Copyright 2016 Mixiaoxiao

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
