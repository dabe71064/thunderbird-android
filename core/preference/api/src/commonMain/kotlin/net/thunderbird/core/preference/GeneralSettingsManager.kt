package net.thunderbird.core.preference

import kotlinx.coroutines.flow.Flow
import net.thunderbird.core.preference.privacy.PrivacySettingsManager

/**
 * Retrieve and modify general settings.
 *
 * TODO: Add more settings as needed.
 */
interface GeneralSettingsManager : PrivacySettingsManager {
    fun getSettings(): GeneralSettings
    fun getSettingsFlow(): Flow<GeneralSettings>

    fun setShowRecentChanges(showRecentChanges: Boolean)
    fun setAppTheme(appTheme: AppTheme)
    fun setMessageViewTheme(subTheme: SubTheme)
    fun setMessageComposeTheme(subTheme: SubTheme)
    fun setFixedMessageViewTheme(fixedMessageViewTheme: Boolean)
    fun setIsShowUnifiedInbox(isShowUnifiedInbox: Boolean)
    fun setIsShowStarredCount(isShowStarredCount: Boolean)
    fun setIsShowMessageListStars(isShowMessageListStars: Boolean)
    fun setIsShowAnimations(isShowAnimations: Boolean)
    fun setIsShowCorrespondentNames(isShowCorrespondentNames: Boolean)
    fun setSetupArchiveShouldNotShowAgain(shouldShowSetupArchiveFolderDialog: Boolean)
    fun setIsMessageListSenderAboveSubject(isMessageListSenderAboveSubject: Boolean)
    fun setIsShowContactName(isShowContactName: Boolean)
    fun setIsShowContactPicture(isShowContactPicture: Boolean)
    fun setIsChangeContactNameColor(isChangeContactNameColor: Boolean)
    fun setIsColorizeMissingContactPictures(isColorizeMissingContactPictures: Boolean)
    fun setIsUseBackgroundAsUnreadIndicator(isUseBackgroundAsUnreadIndicator: Boolean)
    fun setIsShowComposeButtonOnMessageList(isShowComposeButtonOnMessageList: Boolean)
    fun setIsThreadedViewEnabled(isThreadedViewEnabled: Boolean)
    fun setIsUseMessageViewFixedWidthFont(isUseMessageViewFixedWidthFont: Boolean)
    fun setIsAutoFitWidth(isAutoFitWidth: Boolean)
    fun setQuietTimeEnds(quietTimeEnds: String)
    fun setQuietTimeStarts(quietTimeStarts: String)
    fun setIsQuietTimeEnabled(isQuietTimeEnabled: Boolean)
}
