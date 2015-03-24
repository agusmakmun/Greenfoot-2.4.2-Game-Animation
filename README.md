# Greenfoot-2.4.2-Game-Animation
Tutorial Greenfoot 2.4.2 Game Animation

Tutorial Greenfoot 2.4.2 Game Animation by Summon Agus - Using Control Keyboard, If Object is Eat another Object, If isAtEdge, music and another conditional.

Video Tutorial dan download file dapat dilihat disini: http://bloggersmart.net/tutorial-greenfoot-2-4-2-game-animation/

Project Greenfoot Game Animation ini kami beri nama "Kumbang", yang didalam kumbang tersebut ada beberapa Object, diantaranya:

<strong>Class World:</strong>
<ul>
	<li>bg (yang merupakan Backgorund)</li>
</ul>
<strong>Class Actor:</strong>
<ul>
	<li>kumbang (Actor kumbang) --&gt; Pemeran utama.</li>
	<li>grass (Actor grass/rumput) --&gt; Object yang akan dimakan oleh kumbang.</li>
	<li>Counter (Score Nilai) --&gt; Dihitung ketika kumbang berhasil memakan gass (rumput).</li>
</ul>
Dan dibawah ini merupakan beberapa point penting yang ada didalam project "Kumbang" ini.
Seperti contohnya pada code berikut ini:
<pre>public class kumbang extends Actor
</pre>
Dimana pada code tersebut berarti "kumbang" yang merupakan sebuah object, mewarisi seluruh sifat-sifat dari "Actor", dimana "kumbang" sendiri merupakan turunan dari "Actor".

1. Didalam object "kumbang", terdapat script berikut ini. dimana <code>public void act()</code> merupakan power utama untuk menghidupkan object "kumbang" tersebut.
<pre>    public void act() 
    {        
        move(2);
        jalanrandom();
        kendali();
        makan();
        //sembunyi();
        nabrak_dinding();
    }
</pre>
Apabila kita perhatikan, terdapat beberapa function, seperti halnya <code>move(2);</code>, <code>jalanrandom();</code>, <code>kendali();</code> dan sebagainya.
Ini adalah merupakan panggilan dari fungsi-fungsi yang berada dibawahnya, bisa kita bayangkan seperti pemanggilan module.

Misalkan pada <code>jalanrandom();</code>, yang scriptnya seperti ini:
<pre>//untuk jalan random jadi nampak seperti kanan kiri
public void jalanrandom() {
    if (Greenfoot.getRandomNumber(100)&lt;10) {
        turn(Greenfoot.getRandomNumber(40)-20);
    }
}
</pre>
2. Color Counter
Kemudian pada file "Counter", akan terdapat script seperti ini:
<pre>import greenfoot.*;
import java.awt.Color; //module color yang dibutuhkan
</pre>
Dimana untuk menampilkan Color sendiri, kita membutuhkan module Color dari java dengan cara meng-importnya.
<pre>import java.awt.Color;
</pre>
Adapun cara penggunaannya, semisal kita terapkan pada image baru yang akan kita buat seperti ini:
<pre>public void act() 
    {
       //System.out.print("Score:" + score);
       setImage(new GreenfootImage("Score: " + score, 24, Color.GREEN, Color.BLACK));
    }
</pre>
Dimana pada image baru yang kita buat, kita juga menerapkan Color, contoh penggunaanya adalah seperti diatas pada <code>Color.GREEN</code> maupun <code>Color.BLACK</code>, dan untuk 24 sendiri merupakan type dari banyaknya pilihan Color yang kita gunakan pada java, seperti contoh lainnya ada yang <code>32</code>, <code>64</code> maupun yang lainnya.

3. Play Sound (Audio)
Untuk memasukkan audio sendiri, disini saya memasukkannya pada "bg" (background) -&gt; optional. Dan kita perhatikan pada bagian <code>//Greenfoot.playSound("super_mario.mp3");</code> yang mendapat command, ini dapat dihilangkan untuk menghidupkannya, dan kemudian di compile
<pre>
public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        //playying sound on background
        //Greenfoot.playSound("super_mario.mp3");
    }
</pre>
Apabila kita hilangkan pada bagian commandnya, maka akan menjadi seperti ini:
<pre>public bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        //playying sound on background
        Greenfoot.playSound("super_mario.mp3");
    }
</pre>
Dimana ketika kita compile, sound akan langsung terdeteksi.
Dan untuk lebih lengkapnya bisa langsung melihat pada bagian tutorial video yang ada diatas. :)
