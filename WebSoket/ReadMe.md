### WebSocket基本概念  
#### 2.1 WebSocket的协议
WebSocket 协议是一种基于TCP的协议，用于在客户端和服务器之间建立持久连接，并且可以在这个连接上实时地交换数据。WebSocket协议有自己的握手协议，用于建立连接，也有自己的数据传输格式。
当客户端发送一个 WebSocket 请求时，服务器将发送一个协议响应以确认请求。在握手期间，客户端和服务器将协商使用的协议版本、支持的子协议、支持的扩展选项等。一旦握手完成，连接将保持打开状态，客户端和服务器就可以在连接上实时地传递数据。
WebSocket 协议使用的是双向数据传输，即客户端和服务器都可以在任意时间向对方发送数据，而不需要等待对方的请求。它支持二进制数据和文本数据，可以自由地在它们之间进行转换。
总之，WebSocket协议是一种可靠的、高效的、双向的、持久的通信协议，适用于需要实时通信的Web应用程序，如在线游戏、实时聊天等。  
#### 生命周期
1. 连接和建立阶段
2. 连接开放阶段
3. 连接关闭阶段
4. 连接关闭完成阶段

#### API
```javascript
//WebSocket 构造函数： WebSocket 构造函数用于创建 WebSocket 对象。它接受一个 URL 作为参数，表示要连接的 WebSocket 服务器的地址。
let ws = new WebSocket('ws://example.com/ws');
```
WebSocket.send()
```javascript
//WebSocket.send() 方法： WebSocket.send() 方法用于向服务器发送数据。它接受一个参数，表示要发送的数据。
// 数据可以是字符串、Blob 对象或 ArrayBuffer 对象。例如：
let ws = new WebSocket('ws://example.com/ws');
ws.send('Hello,server!')

//WebSocket.onopen 
// 事件： WebSocket.onopen 事件在 WebSocket 连接成功建立时触发
ws.onopen = function () {
    console.log('webSocket 连接已经建立')
}

//WebSocket.onmessage 事件： WebSocket.onmessage 事件在接收到服务器发送的消息时触发。
// 它的 event 对象包含一个 data 属性，表示接收到的数据。
ws.onmessage = function (event) {
    console.log('收到服务器消息',event.data)
}
```
WebSocket.onerror 事件
```javascript
//WebSocket.onerror 
// 事件： WebSocket.onerror 事件在 WebSocket 连接出现错误时触发。
let ws =new WebSocket()
ws.onerror = function (ev) {
    console.error('WebSocket 连接出现错误：', event);
}
```
WebSocket.onclose 事件
```javascript
let ws =new WebSocket()
ws.onclose = function (ev) {
    console.log('WebSocket 连接已经关闭');
    
```

### 在java中使用WebSocket  
```mxml
<dependency>
    <groupId>javax.websocket</groupId>
    <artifactId>javax.websocket-api</artifactId>
    <version>1.1</version>
</dependency>
```