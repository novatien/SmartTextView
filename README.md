# SmartTextView
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
    implementation 'com.github.novatien:SmartTextView:1.0.1'
}
 ```
## Use
```xml
<com.notin.text.SmartTextView
        android:id="@+id/txt_smart"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="14sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
| Method | Meaning |
|--------------|-------|
| void textAppend(String text) | Appends the **text** string to the existing string in SmartTextView |
| void setTextColor(String colorString) | Set text font color according to **Hex** color code | 
| void setTextColor(int color, int startPos, int endPos) | Set the color for the substring from position **startPos** to position **endPos-1** | 
| setTextColor(String colorString, int startPos, int endPos) | Set the color of the **hex** code for the substring from position **startPos** to position **endPos-1** | 
| void setTextTop(float shiftPercentage,int startPos,int endPos) | Brings the substring from **startPos** to **endPos-1** to a **higher position** | 
| void setStrikethrough() | **Strikethrough** all text | 
| void setStrikethrough(int startPos,int endPos) | **Strikethrough** the substring from the **startPos** position to the **endPos-1** position | 
| void setTypeface(TypefaceSmart type) | Bold, italic, and underlined font styles for all text | 
| void setTypeface(TypefaceSmart type,int startPos,int endPos)) | Bold, italic, and underline typography for substring from **startPos** position to **endPos-1** position | 
