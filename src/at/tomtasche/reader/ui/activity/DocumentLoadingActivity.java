package at.tomtasche.reader.ui.activity;

import android.net.Uri;
import at.tomtasche.reader.background.DocumentLoader;

public interface DocumentLoadingActivity {

	public DocumentLoader loadUri(Uri uri);
}
