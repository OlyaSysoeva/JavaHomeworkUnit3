����   4 s  by/java/unit3/task1/Task1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lby/java/unit3/task1/Task1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   3Введите  размер матрицы n x n: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
hasNextInt ()Z
  , - . nextInt ()I 0 %Введите значение > 2: 
  2 3 * hasNext 5 [[I
  7 8 9 rMatric ([[I)V
  ; < 9 findMax args [Ljava/lang/String; n I sc Ljava/util/Scanner; matric StackMapTable F java/util/Random
 E 	
 E I - J (I)I L %3d
 N P O java/lang/Integer Q R valueOf (I)Ljava/lang/Integer;
 " T U V printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; X   rand Ljava/util/Random; i j ^ java/lang/StringBuilder ` +Максимальный элемент в 
 ] b  &
 ] d e f append (I)Ljava/lang/StringBuilder; h  столбце = 
 ] j e k -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 ] m n o toString ()Ljava/lang/String; max 
SourceFile 
Task1.java !               /     *� �    
                    	       �     K<� Y� � M� � !� ,� '� ,� +<� � � /� !,� 1���� 4N-� 6-� :�    
   :    
           $  )  ,  4  ;  B  F  J     *    K = >    I ? @   > A B  B 	 C 5  D    �   	 8 9     �     R� EY� GL=� A>� )*2+d� HO� K� Y*2.� MS� SW�*2���ղ W� !�*�����    
   & 	      "  #  $  % 5 # @ ' H " Q )    *    R C 5    J Y Z  
 G [ @   1 \ @  D    �  E� %�  	 < 9     �     [<� J*2.=>� *2.� 	*2.=�*2���� � ]Y_� a� cg� i� c� l� !�*����� W� !�    
   * 
   ,  .  0  2  3  0 * 6 I , R 8 Z 9    *    [ C 5    P [ @   > p @    \ @  D    � � 
� )  q    r