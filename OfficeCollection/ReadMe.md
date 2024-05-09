### java 操作文件的Office的方法
#### 操作Word
##### Poi-tl简介  
poi-tl是一个免费开源的Java类库，是基于Apache POI的模板引擎，纯Java组件，跨平台，代码短小精悍，通过插件机制使其具有高度扩展性。

因此在使用的时候需要实现设置好模板，就像Freemarker一样，但是比其简单，也易操作。  
##### 常用标签  
###### 2.1文本 
```markdown
 格式： {{var}}
```    
数据模型：  

|   类型   |  描述   |
|:------:|:-----:|
| String |  纯文本  |
|    TextRenderData    |  带有样式的文本  |
|HyperLinkTextRenderData|超链接文本|  

例如：
```java
put("name", "Sayi");
put("author", Texts.of("Sayi").color("000000").create());
put("link", Texts.of("website").link("http://deepoove.com").create());
put("anchor", Texts.of("anchortxt").anchor("appendix1").create());
```    
所见即所得，标签的样式会应用到替换后的文本上，也可以通过代码设定文本的样式。

```json lines
{
  "text": "Sayi",
  "style": {
    "strike": false,
    "bold": true,
    "italic": false,
    "color": "00FF00",
    "underLine": false,
    "fontFamily": "微软雅黑",
    "fontSize": 12,
    "highlightColor": "green",
    "vertAlign": "superscript",
    "characterSpacing" : 20
  }
}
``` 
###### 2.2图片
```markdown
图片标签以@开始：{{@var}}
```      
数据模型  
```markdown
String ：图片url或者本地路径，默认使用图片自身尺寸

ByteArrayPictureRenderData

FilePictureRenderData

UrlPictureRenderData
```  
示例代码  
```java
// 指定图片路径
put("image", "logo.png");
// svg图片
put("svg", "https://img.shields.io/badge/jdk-1.6%2B-orange.svg");

// 图片文件
put("image1", Pictures.ofLocal("logo.png").size(120, 120).create());

// 图片流
put("streamImg",Pictures.ofStream(new FileInputStream("logo.jpeg"), PictureType.JPEG).size(100, 120).create();

// 网络图片(注意网络耗时对系统可能的性能影响)
put("urlImg", Pictures.ofUrl("http://deepoove.com/images/icecream.png").size(100, 100).create());

// java图片，我们可以利用Java生成图表插入到word文档中
put("buffered", Pictures.ofBufferedImage(bufferImage, PictureType.PNG).size(100, 100).create());
```
其他示例去官网查看  
```markdown
https://deepoove.com/poi-tl/
```