package com.example.a3enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String X = "X";
        String O = "O";

        Button b1 =(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b1.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b1.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b9 =(Button) findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b9.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b9.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b2 =(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b2.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b2.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b3 =(Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b3.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b3.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b4 =(Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b4.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b4.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b5 =(Button) findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b5.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b5.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b6 =(Button) findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b6.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b6.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b7 =(Button) findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b7.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b7.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });
        Button b8 =(Button) findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0){
                    b8.setText(X);
                    i++;
                    comprobar(view);
                }
                else{
                    b8.setText(O);
                    i--;
                    comprobar(view);
                }
            }
        });

    }
    public void comprobar(View view){
        String a="GANASTE!!!";
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button b5 = (Button) findViewById(R.id.b5);
        Button b6 = (Button) findViewById(R.id.b6);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button b9 = (Button) findViewById(R.id.b9);
        TextView t1=findViewById(R.id.t1);
        if (b1.getText().toString()==b2.getText().toString() & b3.getText().toString()==b2.getText().toString()){
            if (b1.getText().toString()=="" & b2.getText().toString()==null){

            }else{
                if (b3.getText().toString()=="X" | b3.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b4.getText().toString()==b5.getText().toString() & b6.getText().toString()==b5.getText().toString()){
            if (b4.getText().toString()=="" & b4.getText().toString()==null){

            }else{
                if (b6.getText().toString()=="X" | b6.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b7.getText().toString()==b8.getText().toString() & b9.getText().toString()==b8.getText().toString()){
            if (b4.getText().toString()=="" & b4.getText().toString()==null){

            }else{
                if (b9.getText().toString()=="X" | b9.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b2.getText().toString()==b5.getText().toString() & b8.getText().toString()==b5.getText().toString()){
            if (b5.getText().toString()=="" & b5.getText().toString()==null){

            }else{
                if (b8.getText().toString()=="X" | b8.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b3.getText().toString()==b6.getText().toString() & b9.getText().toString()==b6.getText().toString()){
            if (b6.getText().toString()=="" & b6.getText().toString()==null){

            }else{
                if (b9.getText().toString()=="X" | b9.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b1.getText().toString()==b5.getText().toString() & b9.getText().toString()==b5.getText().toString()){
            if (b5.getText().toString()=="" & b5.getText().toString()==null){

            }else{
                if (b9.getText().toString()=="X" | b9.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b3.getText().toString()==b5.getText().toString() & b7.getText().toString()==b5.getText().toString()){
            if (b5.getText().toString()=="" & b5.getText().toString()==null){

            }else{
                if (b7.getText().toString()=="X" | b7.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }
        if (b1.getText().toString()==b4.getText().toString() & b7.getText().toString()==b4.getText().toString()){
            if (b4.getText().toString()=="" & b4.getText().toString()==null){

            }else{
                if (b7.getText().toString()=="X" | b7.getText().toString()=="O"){
                    t1.setText(a);
                }
            }
        }


    }
}