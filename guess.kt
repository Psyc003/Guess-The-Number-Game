<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
  
    <RelativeLayout
        android:layout_width="409dp"
        android:layout_height="729dp"
        android:background="#F3A68E"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">
  
        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_alignParentLeft="true"
            android:layout_alignParentTop="true"
            android:layout_marginStart="77dp"
            android:layout_marginLeft="77dp"
            android:layout_marginTop="47dp"
            android:background="#FF9100"
            android:text="GUESS THE NUMBER"
            android:textSize="30sp" />
  
        <TextView
            android:id="@+id/textView2"
            android:layout_width="391dp"
            android:layout_height="68dp"
            android:layout_alignParentStart="true"
            android:layout_alignParentLeft="true"
            android:layout_alignParentTop="true"
            android:layout_marginStart="21dp"
            android:layout_marginLeft="21dp"
            android:layout_marginTop="147dp"
            android:text="I am thinking a number between 1 to 100. Can you guess what it  is ?"
            android:textSize="24sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent" />
  
        <EditText
            android:id="@+id/editId"
            android:layout_width="348dp"
            android:layout_height="67dp"
            android:layout_alignParentTop="true"
            android:layout_alignParentEnd="true"
            android:layout_alignParentRight="true"
            android:layout_marginTop="271dp"
            android:layout_marginEnd="30dp"
            android:layout_marginRight="30dp"
            android:ems="10"
            android:gravity="center"
            android:hint="ENTER"
            android:inputType="numberDecimal" />
  
        <Button
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentEnd="true"
            android:layout_alignParentRight="true"
            android:layout_alignParentBottom="true"
            android:layout_marginEnd="152dp"
            android:layout_marginRight="152dp"
            android:layout_marginBottom="266dp"
            android:onClick="clickFunction"
            android:text="GUESS"
            android:textSize="30sp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent" />
  
    </RelativeLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
