package org.sld.cmdfile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.sld.cmdfile.file_item.FileItem;
import org.sld.cmdfile.file_item.FileType;
import org.sld.cmdfile.file_item.MyAdapter;

public class MainActivity extends AppCompatActivity {
    
    private RecyclerView files_list;
    private RecyclerView.LayoutManager manager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        files_list = findViewById(R.id.files_list);
        manager = new LinearLayoutManager(this);
        files_list.setLayoutManager(manager);
        adapter = new MyAdapter(getData());
        files_list.setAdapter(adapter);
    }
    
    private List<FileItem> getData() {
        List<FileItem> items = new ArrayList<>();
        items.add(new FileItem(new File("myFile.txt"), FileType.FILE));
        return items;
    }
}
