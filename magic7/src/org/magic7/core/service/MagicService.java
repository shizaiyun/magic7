package org.magic7.core.service;

import java.util.List;
import java.util.Map;

import org.magic7.core.domain.MagicCodeLib;
import org.magic7.core.domain.MagicDimension;
import org.magic7.core.domain.MagicRegionRow;
import org.magic7.core.domain.MagicChoiceItem;
import org.magic7.core.domain.MagicSuperRowItem;
import org.magic7.core.domain.MagicObject;
import org.magic7.core.domain.MagicObjectRegion;
import org.magic7.core.domain.MagicSpace;
import org.magic7.core.domain.MagicSpaceRegion;
import org.magic7.core.domain.MagicSpaceRegionView;
import org.magic7.core.domain.MagicSpaceRegionViewItem;
import org.magic7.core.domain.MagicRegionCodeLnk;

public interface MagicService {
	public Boolean saveMagicObject(MagicObject magicObject);
	
	public Boolean saveRow(MagicRegionRow row);
	public Boolean saveRowItem(MagicSuperRowItem item);
	public List<MagicDimension> listDimension(String spaceId,String spaceName, String spaceRegionId, String spaceRegionName, String viewName, Integer destination, String orderBy);
	public Boolean deleteRowItemByRowId(String rowId);
	public Boolean deleteRowById(String id);
	public MagicRegionRow getRowById(String id);
	public Boolean saveObjectRegion(MagicObjectRegion region);
	public MagicObjectRegion getObjectRegionById(String id);
	public MagicObject getMagicObjectById(String id);
	public List<MagicSuperRowItem> listRowItem(String partition, String rowId, String viewName, String orderBy);
	public List<MagicSuperRowItem> listRowItem(String partition, String spaceName,String regionName, String viewName,String displayName,String orderBy,Integer start, Integer count);

	public MagicObjectRegion getObjectRegion(String objectId,String spaceRegionName);
	public Boolean saveDimension(MagicDimension dimension);
	public Boolean deleteMagicObjectById(String objectId);
	public Boolean deleteMagicObjectRegionByObjId(String objectId);
	public Boolean deleteRowItemByObjectId(String objectId);
	public Boolean deleteMagicRegionRowByObjId(String objectId);
	public List<MagicObjectRegion> listMagicObjectRegion(String objectId,String spaceId,Integer businessType,String orderBy,Integer start,Integer count);
	public Boolean saveSpaceRegion(MagicSpaceRegion spaceRegion);
	public Boolean saveSpace(MagicSpace space);
	public MagicDimension getDimensionById(String id);
	public List<MagicRegionRow> listRow(String partition,String spaceName,String regionName,String objectId,
			Boolean valid,List<MagicDimension> queryConditions,String orderBy, Integer start, Integer count);
	public MagicDimension getDimension(String spaceName,String regionName, String dimensionName, Integer destination);
	public MagicSpaceRegion getSpaceRegion(String spaceName, String regionName);
	public MagicSpace getSpaceByName(String name);
	public List<MagicObjectRegion> listObjectRegion(String spaceName,String objectId);
	public List<MagicSpaceRegion> listSpaceRegion(String spaceId,String orderBy,Integer start,Integer count);
	public Boolean saveSpaceRegionView(MagicSpaceRegionView view);
	public Boolean saveSpaceRegionViewItem(MagicSpaceRegionViewItem item);
	public List<MagicSpaceRegionViewItem> listSpaceRegionViewItem(String spaceName,String regionName,String viewName, String orderBy);
	public MagicSpaceRegionViewItem getSpaceRegionViewItem(String spaceId,String spaceRegionId,String viewName,String dimensionId);
	public MagicSpaceRegionViewItem getSpaceRegionViewItemWithName(String spaceName,String regionName,
			String viewName,String dimensionId);
	
	public MagicSpaceRegionView getSpaceRegionView(String spaceName,String dimensionRegionName,String viewName);
	public Boolean saveChoiceItem(MagicChoiceItem choiceItem);
	public List<MagicChoiceItem> listChoiceItemByName(String choiceName);
	public List<MagicRegionRow> listRow(String partition,String spaceName,String regionName,String displayName,String objectId,
			Boolean valid,List<MagicDimension> searchCriterias,String orderBy, Integer start, Integer count);
	public Integer listRowCount(String partition, String spaceName,String regionName,
			String displayName, String objectId, Boolean valid, List<MagicDimension> queryConditions);
	public Map<String,MagicSuperRowItem> getRowItemMapByRowId(String rowId);
	public Boolean saveCodeLib(MagicCodeLib lib);
	public MagicCodeLib getCodeLibById(String id);
	public MagicRegionCodeLnk getCodeLnk(String spaceName,String regionName, String signature) ;
	public Boolean saveReginCodeLnk(MagicRegionCodeLnk codeLnk);
	public List<MagicCodeLib> listCodeLib(String spaceName,String regionName, Integer codeType);
	public Boolean isFreshValue(String partition,String spaceName,String regionName,String displayName,String value) ;
	public List<MagicSuperRowItem> getRowItem(String partition,String spaceName,String regionName,String displayName,Object value);
	public MagicCodeLib getJavaCodeLibBySignature(String signature) ;
}
