package unal.todosalau.materialcardejemploanimaciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    CardView cardView = findViewById(R.id.cardView);
    Button button1 = findViewById(R.id.button1);
    Button button2 = findViewById(R.id.button2);
    Button button3 = findViewById(R.id.button3);
    ImageView imageView = findViewById(R.id.imageView);

    Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
    Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.animation1);
    Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.animation2);
    Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.animation3);

    //Animación inicial de la aplicación
    imageView.startAnimation(scaleAnimation);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cardView.startAnimation(animation1);
            // Aquí se coloca el código para lo que se quiera
            // realizar después del clic en el botón
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cardView.startAnimation(animation2);
            // Aquí se coloca el código para lo que se quiera
            // realizar después del clic en el botón
        }
    });


    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cardView.startAnimation(animation3);
            // Aquí se coloca el código para lo que se quiera
            // realizar después del clic en el botón
        }
    });
    }
}