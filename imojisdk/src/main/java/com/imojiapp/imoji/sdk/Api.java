package com.imojiapp.imoji.sdk;

import android.os.Build;

/**
 * Created by sajjadtabib on 5/28/15.
 */
public class Api{

    interface Endpoints {
        String IMOJI_FEATURED_FETCH = Config.BASE_URL + "/imoji/featured/fetch";
        String IMOJI_SEARCH = Config.BASE_URL + "/imoji/search";
        String IMOJI_FETCHMULTIPLE = Config.BASE_URL + "/imoji/fetchMultiple";
        String IMOJI_CATEGORIES_FETCH = Config.BASE_URL + "/imoji/categories/fetch";
        String USER_IMOJI_FETCH = Config.BASE_URL + "/user/imoji/fetch";
        String USER_IMOJI_COLLECTION_ADD = Config.BASE_URL + "/user/imoji/collection/add";
        String OAUTH_TOKEN = Config.BASE_URL + "/oauth/token";
        String OAUTH_EXTERNAL_GETIDPAYLOAD = Config.BASE_URL + "/oauth/external/getIdPayload";
        String IMOJI_CREATE = Config.BASE_URL + "/imoji/create";
        String IMOJI_ACK = Config.BASE_URL + "/imoji/ackImageUpload";
        String REPORT_ABUSIVE_IMOJI = Config.BASE_URL + "/imoji/reportAbusive";
    }

    interface Headers {
        String AUTHORIZATION = "Authorization";
        String SDK_VERSION = "imoji-sdk-version";
        String CLIENT_MODEL = "x-client-model";
        String CLIENT_OS_VERSION = "x-client-os-version";
    }

    interface Params {
        String OFFSET = "offset";
        String NUMRESULTS = "numResults";
        String QUERY = "query";
        String SENTENCE = "sentence";
        String ACCESS_TOKEN = "access_token";
        String IDS = "ids";
        String CLASSIFICATION = "classification";
        String IMOJIID = "imojiId";
        String GRANT_TYPE = "grant_type";
        String REFRESH_TOKEN = "refresh_token";
        String CLIENTID = "clientId";
        String TAGS = "tags";
        String HAS_FULL_IMAGE = "hasFullImage";
        String HAS_THUMB_IMAGE = "hasThumbnailImage";
    }

    public interface SearchParams {
        String OFFSET = Params.OFFSET;
        String NUM_RESULTS = Params.NUMRESULTS;
        String QUERY = Params.QUERY;
        String SENTENCE = Params.SENTENCE;
    }
}
