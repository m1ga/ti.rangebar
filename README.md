# ti.rangebar - Android Rangebar module

<span class="badge-buymeacoffee"><a href="https://www.buymeacoffee.com/miga" title="donate"><img src="https://img.shields.io/badge/buy%20me%20a%20coke-donate-orange.svg" alt="Buy Me A Coke donate button" /></a></span>

<img src="images/screen.png"/>

Appcelerator Titanum Rangebar module for Android.<br/>
Based on <https://github.com/oli107/material-range-bar>

## Example

```xml
<RangebarView module="ti.rangebar" onChange="onChangeDistance" tickStart="2" tickEnd="100" tickInterval="2" connectionLineColor="#000" tickColor="transparent" leftThumbColor="#000" rightThumbColor="#000" height="Ti.UI.SIZE"/>
```

## Properties:

<table>
<tr>
	<td>range</td>
	<td>Two (true/default) or one thumb (false; right only)</td>
</tr>
<tr>
	<td>tickStart</td>
	<td>Start value</td>
</tr>
<tr>
	<td>tickEnd</td>
	<td>End value</td>
</tr>
<tr>
	<td>tickInterval</td>
	<td>Steps</td>
</tr>
<tr>
	<td>thumbSize</td>
	<td>Size of the left/right thumb</td>
</tr>
<tr>
	<td>tickColor</td>
	<td>Tick/Dot color (can be transparent)</td>
</tr>
<tr>
	<td>leftThumbColor</td>
	<td>Left thumb color</td>
</tr>
<tr>
	<td>rightThumbColor</td>
	<td>Right thumb color</td>
</tr>
<tr>
	<td>connectionLineColor</td>
	<td>Color between ticks/dots</td>
</tr>
<tr>
	<td>tickSize</td>
	<td>Tick/dot size (can be zero)</td>
</tr>
<tr>
	<td>pinColor</td>
	<td>Color of the pin/bubble</td>
</tr>
<tr>
	<td>pinRadus</td>
	<td>Radus of the pin/bubble</td>
</tr>
<tr>
	<td>staticPins</td>
	<td>Only show pin/bubble when touching thumb (default/true) or show it all the time (false)</td>
</tr>
</table>

_Attention_
If you set the height to `Ti.UI.SIZE` it will include the space for the pin/bubble. Make sure to set a fixed height if you want to have it smaler and use it without pins/bubbles.

## Events

* onChange - startValue/endValue
* onTouchStart - startValue/endValue
* onTouchEnd - startValue/endValue
