package com.sjtu.mts.Service;

import com.sjtu.mts.Response.*;

public interface SearchService {

    public DataResponse Search(String keyword, String cflag, String startPublishedDay, String endPublishedDay,
                               String fromType, int page, int pageSize, int timeOrder);
;

    public ResourceCountResponse globalSearchResourceCount(String keyword, String startPublishedDay,
                                                           String endPublishedDay);

    public CflagCountResponse globalSearchCflagCount(String keyword, String startPublishedDay, String endPublishedDay);

    public AmountTrendResponse globalSearchTrendCount(String keyword, String startPublishedDay, String endPublishedDay);

    public AreaAnalysisResponse countArea(String keyword, String startPublishedDay, String endPublishedDay);

    public DataResponse fangAnSearch(String keyword,int kisAnd,String fromType,String area,int aisAnd,String startPublishedDay, String endPublishedDay,
                                     int page, int pageSize, int timeOrder);
}
