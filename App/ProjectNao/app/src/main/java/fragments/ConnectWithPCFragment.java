package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nao.sabina.projectnao.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConnectWithPCFragment extends Fragment {


    public ConnectWithPCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_connect_with_pc, container, false);
        /*Button button = (Button) v.findViewById(R.id.downloadPc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDownloadFromPcHelp(v);
            }
        });*/
        // Inflate the layout for this fragment
        return v;
    }

    public void showDownloadFromPcHelp(View v){
        Intent intent = new Intent(this.getActivity(), DownloadFromPcHelpFragment.class);
        startActivity(intent);
    }

}
