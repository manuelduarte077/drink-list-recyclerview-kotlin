package com.hardsoftday.drinklist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerDrink)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val bebida = ArrayList<Bebida>()

        bebida.add(
                Bebida(
                        1,
                        "Ron Plata",
                         R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                         R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )


        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )


        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )

        bebida.add(
                Bebida(
                        1,
                        "Extra Lite",
                        R.drawable.ron_plata,
                        "Praesent sapien massa, convallis a pellentesque nec, egestas non nisi. Vivamus suscipit tortor eget felis porttitor volutpat. Curabitur non nulla sit amet nisl tempus convallis quis ac lectus. Cras ultricies ligula sed magna dictum porta.")
        )


        val adapter = BebidaAdapter(bebida)
        recyclerView.adapter = adapter


    }
}