package app.k9mail.feature.navigation.drawer.ui.folder

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.designsystem.PreviewWithTheme
import app.k9mail.feature.navigation.drawer.ui.FakeData.DISPLAY_FOLDER
import app.k9mail.feature.navigation.drawer.ui.FakeData.DISPLAY_TREE_FOLDER
import app.k9mail.feature.navigation.drawer.ui.FakeData.DISPLAY_TREE_FOLDER_WITH_UNIFIED_FOLDER
import app.k9mail.feature.navigation.drawer.ui.FakeData.EMPTY_DISPLAY_TREE_FOLDER

@Composable
@Preview(showBackground = true)
internal fun FolderListPreview() {
    PreviewWithTheme {
        FolderList(
            rootFolder = EMPTY_DISPLAY_TREE_FOLDER,
            selectedFolder = null,
            onFolderClick = {},
            showStarredCount = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun FolderListPreviewSelected() {
    PreviewWithTheme {
        FolderList(
            rootFolder = DISPLAY_TREE_FOLDER,
            selectedFolder = DISPLAY_FOLDER,
            onFolderClick = {},
            showStarredCount = false,
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun FolderListWithUnifiedFolderPreview() {
    PreviewWithTheme {
        FolderList(
            rootFolder = DISPLAY_TREE_FOLDER_WITH_UNIFIED_FOLDER,
            selectedFolder = DISPLAY_FOLDER,
            onFolderClick = {},
            showStarredCount = false,
        )
    }
}
