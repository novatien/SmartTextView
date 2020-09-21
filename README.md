# SmartTextView

<img src="https://imgur.com/ljunKUQ.png">

## Gradle
```gradle
allprojects{
	repositories{
		...
		maven { url 'https://jitpack.io' }
	}
}

dependencies{
    ...
    implementation 'com.github.novatien:SmartTextView:1.01'
}
 ```
## Use
**Add .xml file**
```xml
 <com.notin.text.SmartTextView
        android:id="@+id/txt_smart"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="20sp"
        android:textColor="#000000"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
**SmartTextView inherits all the properties and methods of TextView. So I just introduce a few more special methods.**
| Method | Meaning |
|--------------|-------|
| void textAppend(String text) | Appends the **text** string to the existing string in SmartTextView |
| void setTextColor(String colorString) | Set text font color according to **Hex** color code | 
| void setTextColor(int color, int startPos, int endPos) | Set the color for the substring from position **startPos** to position **endPos-1** | 
| void setTextColor(String colorString, int startPos, int endPos) | Set the color of the **hex** code for the substring from position **startPos** to position **endPos-1** | 
| void setTextTop(float shiftPercentage,int startPos,int endPos) | Brings the substring from **startPos** to **endPos-1** to a **higher position** | 
| void setStrikethrough() | **Strikethrough** all text | 
| void setStrikethrough(int startPos,int endPos) | **Strikethrough** the substring from the **startPos** position to the **endPos-1** position | 
| void setTypeface(TypefaceSmart type) | Bold, italic, and underlined font styles for all text | 
| void setTypeface(TypefaceSmart type,int startPos,int endPos) | Bold, italic, and underline typography for substring from **startPos** position to **endPos-1** position | 
## Example
1. textAppend(String text)
```kotlin
   txt_smart.text="Hello"
   txt_smart.textAppend(" NoTin")
```
<img src="https://imgur.com/QuTM7zy.png">

2. setTextColor(String colorString)
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTextColor("#FF0000")
```
<img src="https://imgur.com/AZ3u9F3.png">

3. setTextColor(int color, int startPos, int endPos)
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTextColor(Color.GREEN,0,6)
```
<img src="https://imgur.com/ZY1g1iW.png">

4. setTextColor(String colorString, int startPos, int endPos)
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTextColor("#0000EE",0,6)
```
<img src="https://imgur.com/0BL48AX.png">

5. setTextTop(float shiftPercentage,int startPos,int endPos)
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTextTop(0.5f,0,5)
```
<img src="https://imgur.com/L6HXlW2.png">

6. setStrikethrough()
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setStrikethrough()
```
<img src="https://imgur.com/py3toA9.png">

7. setStrikethrough(int startPos,int endPos)
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setStrikethrough(0,6)
```
<img src="https://imgur.com/JE3GLvT.png">

8. setTypeface(TypefaceSmart type)

**TypefaceSmart is an enum with the following values:**
* BOLD
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD)
```
<img src="https://imgur.com/Yomh83B.png">

* ITALIC
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.ITALIC)
```
<img src="https://imgur.com/SP4uYAQ.png">

* UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.UNDERLINE)
```
<img src="https://imgur.com/xSfvtik.png">

* BOLD_ITALIC
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_ITALIC)
```
<img src="https://imgur.com/A7NWUQE.png">

* BOLD_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_UNDERLINE)
```
<img src="https://imgur.com/Jz9Di5m.png">

* ITALIC_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.ITALIC_UNDERLINE)
```
<img src="https://imgur.com/mWNFt26.png">

* BOLD_ITALIC_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_ITALIC_UNDERLINE)
```
<img src="https://imgur.com/m6bKEZU.png">

9. setTypeface(TypefaceSmart type,int startPos,int endPos)

**TypefaceSmart is an enum with the following values:**
* BOLD
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD,0,6)
```
* ITALIC
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.ITALIC,0,6)
```
* UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.UNDERLINE,0,6)
```
* BOLD_ITALIC
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_ITALIC,0,6)
```
* BOLD_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_UNDERLINE,0,6)
```
* ITALIC_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.ITALIC_UNDERLINE,0,6)
```
* BOLD_ITALIC_UNDERLINE
```kotlin
   txt_smart.text="Hello NoTin, Nice to meet you!"
   txt_smart.setTypeface(TypefaceSmart.BOLD_ITALIC_UNDERLINE,0,6)
```
 
