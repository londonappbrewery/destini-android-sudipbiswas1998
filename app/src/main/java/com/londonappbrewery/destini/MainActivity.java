package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mBottomButton;
    TextView mStoryTextView;
    int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton=findViewById(R.id.buttonTop);
        mBottomButton= findViewById(R.id.buttonBottom);
        mStoryTextView= findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1 ) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
                else if(mStoryIndex==3){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                }
                else {
                    mStoryTextView.setText(R.string.T6_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                }
                else if(mStoryIndex==2){
                    mStoryTextView.setText(R.string.T4_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }
                else{
                    mStoryTextView.setText(R.string.T5_End);
                    mBottomButton.setVisibility(View.GONE);
                    mTopButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
