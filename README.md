[![Coverage Status](https://coveralls.io/repos/EsteveAguilera/PrettyStrings/badge.svg?branch=master)](https://coveralls.io/r/EsteveAguilera/PrettyStrings?branch=master)

# PrettyStrings

A small library to give some prettiness to your project strings!

Have you ever worked with an API that gives you strings like "HOLIDAYS" or "holidays" when you expected something more ready to use like "Holidays"?

The Sample
----------

```java
String uglyString = "JUST A SAMPLE STRING";

PrettyString prettyString = new PrettyString();

String result = prettyString.capitalizeFirstLetter(uglyString); // => "Just a sample string"

String otherResult = prettyString.capitalizeAllFirstLetters(uglyString); // => "Just A Sample String"
```

## LICENSE ##

The MIT License (MIT)

Copyright (c) 2015 Fewlaps

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
