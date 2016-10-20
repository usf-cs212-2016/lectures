<!DOCTYPE html>

<head>
    <meta charset="utf-8">
    <title>Mini Adventure!</title>
    
    <!-- See http://www.google.com/fonts for free webfonts. //-->
    <link href='http://fonts.googleapis.com/css?family=Overlock:400,900,400italic' rel='stylesheet' type='text/css'>
    
    <style type="text/css">
    body {
        font-family: "Overlock";
        font-size: 12pt;  
        font-weight: 400;
    }
    
    input {
        font-size: 16pt;
        width: 75px;
    } 
    
    .header {
        font-style: italic;
    }
    
    .message {
        font-weight: 900;
    }
    
    .debug {
        font-size: 10pt;
        font-style: italic;
        
        text-align: right;
        color: #444444;
    }
    </style>
</head>

<body>

<p class="header">
<a href="http://www.flickr.com/photos/glsmyth/2452008828/" title="House Of Dreams by George L Smyth, on Flickr"><img src="http://farm4.staticflickr.com/3085/2452008828_b3d4e2836a_m.jpg" width="240" height="166" alt="House Of Dreams"></a>
<br>
You are famished, and desperately need a good meal. 
You found an old house, and are searching for something to eat.
</p> 

<p class="message">
$message$
</p>

<p>
Where do you want to go next?
</p>

<form action="$action$" method="post">
<table border="0" cellspacing="0" cellpadding="0">
<tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="direction" value="NORTH" $north$></td>
    <td>&nbsp;</td>
</tr>
<tr>
    <td><input type="submit" name="direction" value="WEST" $west$></td>
    <td>&nbsp;</td>
    <td><input type="submit" name="direction" value="EAST" $east$></td>
</tr>
<tr>
    <td>&nbsp;</td>
    <td><input type="submit" name="direction" value="SOUTH" $south$></td>
    <td>&nbsp;</td>
</tr>
</table>
</form>

<p><a href="/">(start over?)</a></p>

<p class="debug">
session id: $session$, 
room: $room$, 
direction: $direction$
</p>

</body>
</html>