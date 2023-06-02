package com.example.sprintmodulo4;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewbinding.ViewBinding;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.example.sprintmodulo4.databinding.ActivityMainBinding;
import com.example.sprintmodulo4.databinding.LayoutLandscapeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private LayoutLandscapeBinding landscapeBinding;
    private ActivityMainBinding binding;
    private FloatingActionButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       binding = ActivityMainBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            landscapeBinding = LayoutLandscapeBinding.inflate(getLayoutInflater());
            setContentView(landscapeBinding.getRoot());
            button = landscapeBinding.floatingActionButton;

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            });
        } else { setContentView(binding.getRoot());
        }
    }
}