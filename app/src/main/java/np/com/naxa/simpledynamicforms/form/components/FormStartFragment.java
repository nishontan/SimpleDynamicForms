package np.com.naxa.simpledynamicforms.form.components;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import np.com.naxa.simpledynamicforms.R;
import np.com.naxa.simpledynamicforms.form.listeners.fragmentStateListener;
import timber.log.Timber;


public class FormStartFragment extends Fragment implements fragmentStateListener {


    public FormStartFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_start, container, false);

    }


    @Override
    public void fragmentStateChange(int state, int pos) {
        Timber.i(" State %s pos %s", state, pos);
    }
}
