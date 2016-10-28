package com.a30.sharedfunctionality.Utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;

import com.a30.sharedfunctionality.R;

public class Form {
    static public boolean validateForm(Context context, EditText... inputs) {
        boolean isValid = true;

        for (int i = 0; i < inputs.length; i++) {
            EditText input = inputs[i];
            String inputText = input.getText().toString();

            if (TextUtils.isEmpty(inputText)) {
                input.setError(context.getString(R.string.login_fieldRequired));
                isValid = false;
            } else {
                if (input.getInputType() == 33) {
                    if (!android.util.Patterns.EMAIL_ADDRESS.matcher(inputText).matches()) {
                        isValid = false;
                        input.setError(context.getString(R.string.errors_invalid_email));
                        continue;
                    }
                }
                input.setError(null);
            }
        }

        return isValid;
    }
}
