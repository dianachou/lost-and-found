package com.cmsc436.final_project.lostandfoundapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class PostNewLostReportActivity extends AppCompatActivity {

    private final static String TAG = "Post New Lost Report Activity";

    protected EditText mTitleTextField; // The text field for the title of the post.
    protected EditText mDescriptionTextField;   // The text field for a description.
    protected EditText mAddressTextField;
    protected FirebaseAuth mFirebaseAuth;
    protected DatabaseReference mDatabaseReference;
    protected String currentUserName;

    // Buttons
    protected Button submitLostReportButton;
    protected Button cancelLostReportButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_new_lost_report);

        // TODO: Implement the logic to get the necessary information from the
        // EditText elements and push a new foundReport into the Firebase.
        // This requires us to have an xml that has the necessary id's. So Whoever
        // makes the xml and choose to do this, they can fill in the missing pieces.

        /* To push the new item report, we need to get the current users username.
         * this might involve more querying...Hope this skeleton helps.
         *
         */


        mFirebaseAuth = FirebaseAuth.getInstance();
        currentUserName = mFirebaseAuth.getCurrentUser().getDisplayName();  // Get the username of the logged in user.

        // Get reference to the 'users' tree in the Firebase Database
        mDatabaseReference = FirebaseDatabase.getInstance().getReference("lost_reports");

        // Getting the Views for the buttons on the page
        submitLostReportButton = findViewById(R.id.submitLostReport);
        cancelLostReportButton = findViewById(R.id.cancelLostReportButton);


        submitLostReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Diarre, implement the same stuff we did for the found report
                // only use the reference for the "lost_reports" child.
            }
        });

        cancelLostReportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If they cancel then just end the activity and go back to the lost fragment
                finish();
            }
        });

    }

}
