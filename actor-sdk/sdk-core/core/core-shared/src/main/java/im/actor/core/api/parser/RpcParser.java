package im.actor.core.api.parser;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.rpc.*;
import im.actor.core.api.base.*;

public class RpcParser extends BaseParser<RpcScope> {
    @Override
    public RpcScope read(int type, byte[] payload) throws IOException {
        switch(type) {
            case 191: return RequestStartPhoneAuth.fromBytes(payload);
            case 197: return RequestSendCodeByPhoneCall.fromBytes(payload);
            case 185: return RequestStartEmailAuth.fromBytes(payload);
            case 198: return RequestStartAnonymousAuth.fromBytes(payload);
            case 203: return RequestStartTokenAuth.fromBytes(payload);
            case 2571: return RequestStartUsernameAuth.fromBytes(payload);
            case 189: return RequestValidateCode.fromBytes(payload);
            case 207: return RequestValidatePassword.fromBytes(payload);
            case 194: return RequestGetOAuth2Params.fromBytes(payload);
            case 196: return RequestCompleteOAuth2.fromBytes(payload);
            case 190: return RequestSignUp.fromBytes(payload);
            case 80: return RequestGetAuthSessions.fromBytes(payload);
            case 82: return RequestTerminateSession.fromBytes(payload);
            case 83: return RequestTerminateAllSessions.fromBytes(payload);
            case 84: return RequestSignOut.fromBytes(payload);
            case 3: return RequestSignInObsolete.fromBytes(payload);
            case 4: return RequestSignUpObsolete.fromBytes(payload);
            case 1: return RequestSendAuthCodeObsolete.fromBytes(payload);
            case 90: return RequestSendAuthCallObsolete.fromBytes(payload);
            case 96: return RequestEditUserLocalName.fromBytes(payload);
            case 2649: return RequestLoadFullUsers.fromBytes(payload);
            case 53: return RequestEditName.fromBytes(payload);
            case 205: return RequestEditNickName.fromBytes(payload);
            case 206: return RequestCheckNickName.fromBytes(payload);
            case 212: return RequestEditAbout.fromBytes(payload);
            case 31: return RequestEditAvatar.fromBytes(payload);
            case 91: return RequestRemoveAvatar.fromBytes(payload);
            case 144: return RequestEditMyTimeZone.fromBytes(payload);
            case 145: return RequestEditMyPreferredLanguages.fromBytes(payload);
            case 7: return RequestImportContacts.fromBytes(payload);
            case 87: return RequestGetContacts.fromBytes(payload);
            case 89: return RequestRemoveContact.fromBytes(payload);
            case 114: return RequestAddContact.fromBytes(payload);
            case 112: return RequestSearchContacts.fromBytes(payload);
            case 2636: return RequestBlockUser.fromBytes(payload);
            case 2637: return RequestUnblockUser.fromBytes(payload);
            case 2638: return RequestLoadBlockedUsers.fromBytes(payload);
            case 92: return RequestSendMessage.fromBytes(payload);
            case 2658: return RequestUpdateMessage.fromBytes(payload);
            case 55: return RequestMessageReceived.fromBytes(payload);
            case 57: return RequestMessageRead.fromBytes(payload);
            case 98: return RequestDeleteMessage.fromBytes(payload);
            case 99: return RequestClearChat.fromBytes(payload);
            case 100: return RequestDeleteChat.fromBytes(payload);
            case 2654: return RequestArchiveChat.fromBytes(payload);
            case 210: return RequestMessageSetReaction.fromBytes(payload);
            case 220: return RequestMessageRemoveReaction.fromBytes(payload);
            case 118: return RequestLoadHistory.fromBytes(payload);
            case 104: return RequestLoadDialogs.fromBytes(payload);
            case 2651: return RequestLoadArchived.fromBytes(payload);
            case 225: return RequestLoadGroupedDialogs.fromBytes(payload);
            case 231: return RequestHideDialog.fromBytes(payload);
            case 232: return RequestShowDialog.fromBytes(payload);
            case 224: return RequestFavouriteDialog.fromBytes(payload);
            case 227: return RequestUnfavouriteDialog.fromBytes(payload);
            case 2785: return RequestNotifyDialogOpened.fromBytes(payload);
            case 65: return RequestCreateGroupObsolete.fromBytes(payload);
            case 230: return RequestCreateGroup.fromBytes(payload);
            case 199: return RequestEnterGroup.fromBytes(payload);
            case 85: return RequestEditGroupTitle.fromBytes(payload);
            case 86: return RequestEditGroupAvatar.fromBytes(payload);
            case 101: return RequestRemoveGroupAvatar.fromBytes(payload);
            case 69: return RequestInviteUser.fromBytes(payload);
            case 70: return RequestLeaveGroup.fromBytes(payload);
            case 71: return RequestKickUser.fromBytes(payload);
            case 211: return RequestEditGroupTopic.fromBytes(payload);
            case 213: return RequestEditGroupAbout.fromBytes(payload);
            case 214: return RequestMakeUserAdmin.fromBytes(payload);
            case 177: return RequestGetGroupInviteUrl.fromBytes(payload);
            case 179: return RequestRevokeInviteUrl.fromBytes(payload);
            case 180: return RequestJoinGroup.fromBytes(payload);
            case 238: return RequestLoadOwnStickers.fromBytes(payload);
            case 244: return RequestAddStickerCollection.fromBytes(payload);
            case 245: return RequestRemoveStickerCollection.fromBytes(payload);
            case 246: return RequestLoadStickerCollection.fromBytes(payload);
            case 233: return RequestPeerSearch.fromBytes(payload);
            case 217: return RequestMessageSearch.fromBytes(payload);
            case 222: return RequestMessageSearchMore.fromBytes(payload);
            case 201: return RequestGetPublicGroups.fromBytes(payload);
            case 2563: return RequestLoadOwnSentInvites.fromBytes(payload);
            case 2565: return RequestSendInvite.fromBytes(payload);
            case 2561: return RequestLoadOwnTeams.fromBytes(payload);
            case 2566: return RequestCreateTeam.fromBytes(payload);
            case 2568: return RequestInviteToTeam.fromBytes(payload);
            case 182: return RequestGetIntegrationToken.fromBytes(payload);
            case 184: return RequestRevokeIntegrationToken.fromBytes(payload);
            case 27: return RequestTyping.fromBytes(payload);
            case 30: return RequestStopTyping.fromBytes(payload);
            case 29: return RequestSetOnline.fromBytes(payload);
            case 2641: return RequestPauseNotifications.fromBytes(payload);
            case 2642: return RequestRestoreNotifications.fromBytes(payload);
            case 77: return RequestGetFileUrl.fromBytes(payload);
            case 2573: return RequestGetFileUrls.fromBytes(payload);
            case 2579: return RequestGetFileUrlBuilder.fromBytes(payload);
            case 97: return RequestGetFileUploadUrl.fromBytes(payload);
            case 122: return RequestCommitFileUpload.fromBytes(payload);
            case 142: return RequestGetFileUploadPartUrl.fromBytes(payload);
            case 2588: return RequestEnableFeature.fromBytes(payload);
            case 2589: return RequestDisableFeature.fromBytes(payload);
            case 2590: return RequestCheckFeatureEnabled.fromBytes(payload);
            case 2665: return RequestCreateNewEventBus.fromBytes(payload);
            case 2668: return RequestJoinEventBus.fromBytes(payload);
            case 2675: return RequestReJoinEventBus.fromBytes(payload);
            case 2670: return RequestKeepAliveEventBus.fromBytes(payload);
            case 2667: return RequestDisposeEventBus.fromBytes(payload);
            case 2671: return RequestPostToEventBus.fromBytes(payload);
            case 2679: return RequestLoadSyncedSet.fromBytes(payload);
            case 2600: return RequestGetCallInfo.fromBytes(payload);
            case 2597: return RequestDoCall.fromBytes(payload);
            case 2677: return RequestUpgradeCall.fromBytes(payload);
            case 2678: return RequestDoCallAgain.fromBytes(payload);
            case 2683: return RequestJoinCall.fromBytes(payload);
            case 2684: return RequestRejectCall.fromBytes(payload);
            case 2685: return RequestOptimizeSDP.fromBytes(payload);
            case 134: return RequestGetParameters.fromBytes(payload);
            case 128: return RequestEditParameter.fromBytes(payload);
            case 243: return RequestStoreEvents.fromBytes(payload);
            case 2569: return RequestRawRequest.fromBytes(payload);
            case 241: return RequestLoadWallpappers.fromBytes(payload);
            case 51: return RequestRegisterGooglePush.fromBytes(payload);
            case 2631: return RequestUnregisterGooglePush.fromBytes(payload);
            case 76: return RequestRegisterApplePush.fromBytes(payload);
            case 2632: return RequestUnregisterApplePush.fromBytes(payload);
            case 2576: return RequestRegisterApplePushKit.fromBytes(payload);
            case 2633: return RequestUnregisterApplePushKit.fromBytes(payload);
            case 2593: return RequestRegisterApplePushToken.fromBytes(payload);
            case 2634: return RequestUnregisterApplePushToken.fromBytes(payload);
            case 2575: return RequestRegisterActorPush.fromBytes(payload);
            case 2635: return RequestUnregisterActorPush.fromBytes(payload);
            case 2601: return RequestLoadPublicKeyGroups.fromBytes(payload);
            case 2605: return RequestLoadPublicKey.fromBytes(payload);
            case 2603: return RequestLoadPrePublicKeys.fromBytes(payload);
            case 2609: return RequestCreateNewKeyGroup.fromBytes(payload);
            case 2611: return RequestDeleteKeyGroup.fromBytes(payload);
            case 2613: return RequestDisconnectKeyGroup.fromBytes(payload);
            case 2614: return RequestConnectKeyGroup.fromBytes(payload);
            case 2612: return RequestUploadPreKey.fromBytes(payload);
            case 2657: return RequestSendEncryptedPackage.fromBytes(payload);
            case 2660: return RequestUploadSharedBlob.fromBytes(payload);
            case 2662: return RequestDownloadSharedBlob.fromBytes(payload);
            case 9: return RequestGetState.fromBytes(payload);
            case 11: return RequestGetDifference.fromBytes(payload);
            case 2628: return RequestGetReferencedEntitites.fromBytes(payload);
            case 32: return RequestSubscribeToOnline.fromBytes(payload);
            case 33: return RequestSubscribeFromOnline.fromBytes(payload);
            case 74: return RequestSubscribeToGroupOnline.fromBytes(payload);
            case 75: return RequestSubscribeFromGroupOnline.fromBytes(payload);
            case 229: return RequestNotifyAboutDeviceInfo.fromBytes(payload);
            case 116: return RequestInitWebaction.fromBytes(payload);
            case 123: return RequestCompleteWebaction.fromBytes(payload);
            case 193: return ResponseStartPhoneAuth.fromBytes(payload);
            case 186: return ResponseStartEmailAuth.fromBytes(payload);
            case 2572: return ResponseStartUsernameAuth.fromBytes(payload);
            case 195: return ResponseGetOAuth2Params.fromBytes(payload);
            case 5: return ResponseAuth.fromBytes(payload);
            case 81: return ResponseGetAuthSessions.fromBytes(payload);
            case 2: return ResponseSendAuthCodeObsolete.fromBytes(payload);
            case 2650: return ResponseLoadFullUsers.fromBytes(payload);
            case 103: return ResponseEditAvatar.fromBytes(payload);
            case 8: return ResponseImportContacts.fromBytes(payload);
            case 88: return ResponseGetContacts.fromBytes(payload);
            case 113: return ResponseSearchContacts.fromBytes(payload);
            case 2639: return ResponseLoadBlockedUsers.fromBytes(payload);
            case 219: return ResponseReactionsResponse.fromBytes(payload);
            case 119: return ResponseLoadHistory.fromBytes(payload);
            case 105: return ResponseLoadDialogs.fromBytes(payload);
            case 2652: return ResponseLoadArchived.fromBytes(payload);
            case 226: return ResponseLoadGroupedDialogs.fromBytes(payload);
            case 235: return ResponseDialogsOrder.fromBytes(payload);
            case 66: return ResponseCreateGroupObsolete.fromBytes(payload);
            case 216: return ResponseCreateGroup.fromBytes(payload);
            case 200: return ResponseEnterGroup.fromBytes(payload);
            case 115: return ResponseEditGroupAvatar.fromBytes(payload);
            case 215: return ResponseMakeUserAdmin.fromBytes(payload);
            case 178: return ResponseInviteUrl.fromBytes(payload);
            case 181: return ResponseJoinGroup.fromBytes(payload);
            case 240: return ResponseStickersReponse.fromBytes(payload);
            case 239: return ResponseLoadOwnStickers.fromBytes(payload);
            case 247: return ResponseLoadStickerCollection.fromBytes(payload);
            case 234: return ResponsePeerSearch.fromBytes(payload);
            case 218: return ResponseMessageSearchResponse.fromBytes(payload);
            case 202: return ResponseGetPublicGroups.fromBytes(payload);
            case 2564: return ResponseInviteList.fromBytes(payload);
            case 2562: return ResponseTeamsList.fromBytes(payload);
            case 2567: return ResponseCreateTeam.fromBytes(payload);
            case 183: return ResponseIntegrationToken.fromBytes(payload);
            case 78: return ResponseGetFileUrl.fromBytes(payload);
            case 2574: return ResponseGetFileUrls.fromBytes(payload);
            case 2580: return ResponseGetFileUrlBuilder.fromBytes(payload);
            case 121: return ResponseGetFileUploadUrl.fromBytes(payload);
            case 138: return ResponseCommitFileUpload.fromBytes(payload);
            case 141: return ResponseGetFileUploadPartUrl.fromBytes(payload);
            case 2666: return ResponseCreateNewEventBus.fromBytes(payload);
            case 2669: return ResponseJoinEventBus.fromBytes(payload);
            case 2676: return ResponseReJoinEventBus.fromBytes(payload);
            case 2680: return ResponseLoadSyncedSet.fromBytes(payload);
            case 2606: return ResponseGetCallInfo.fromBytes(payload);
            case 2598: return ResponseDoCall.fromBytes(payload);
            case 2686: return ResponseOptimizeSDP.fromBytes(payload);
            case 135: return ResponseGetParameters.fromBytes(payload);
            case 2570: return ResponseRawRequest.fromBytes(payload);
            case 242: return ResponseLoadWallpappers.fromBytes(payload);
            case 2602: return ResponsePublicKeys.fromBytes(payload);
            case 2604: return ResponsePublicKeyGroups.fromBytes(payload);
            case 2610: return ResponseCreateNewKeyGroup.fromBytes(payload);
            case 2664: return ResponseSendEncryptedPackage.fromBytes(payload);
            case 2661: return ResponseUploadSharedBlob.fromBytes(payload);
            case 2663: return ResponseDownloadSharedBlob.fromBytes(payload);
            case 12: return ResponseGetDifference.fromBytes(payload);
            case 2629: return ResponseGetReferencedEntitites.fromBytes(payload);
            case 50: return ResponseVoid.fromBytes(payload);
            case 72: return ResponseSeq.fromBytes(payload);
            case 102: return ResponseSeqDate.fromBytes(payload);
            case 209: return ResponseBool.fromBytes(payload);
            case 117: return ResponseInitWebaction.fromBytes(payload);
            case 124: return ResponseCompleteWebaction.fromBytes(payload);
            case 13: return SeqUpdate.fromBytes(payload);
            case 73: return FatSeqUpdate.fromBytes(payload);
            case 26: return WeakUpdate.fromBytes(payload);
            case 2673: return WeakFatUpdate.fromBytes(payload);
            case 25: return SeqUpdateTooLong.fromBytes(payload);
            case 2625: return CombinedUpdate.fromBytes(payload);
        }
        throw new IOException();
    }
}
