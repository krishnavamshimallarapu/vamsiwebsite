

package cuppytrail;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"Stadium",
			"GenericItem",
			de.hybris.platform.cuppytrail.jalo.Stadium.class,
			"de.hybris.platform.persistence.cuppytrail_Stadium",
			false,
			null,
			false
		);
	
		createItemType(
			"NotEmptyCuppyConstraint",
			"AttributeConstraint",
			de.hybris.platform.cuppytrail.constraints.NotEmptyCuppyConstraint.class,
			null,
			false,
			null,
			false
		);
	
		createRelationType(
			"StadiumMatchRelation",
			null,
			true
		);
	
		createEnumerationType(
			"StadiumType",
			null
		);
	
		createEnumerationType(
			"StadiumAccess",
			null
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_Stadium_code();
			
				single_createattr_Stadium_capacity();
			
				single_createattr_Stadium_StadiumType();
			
				single_createattr_Stadium_stadiumImage();
			
				single_createattr_MatchBet_matchScore();
			
				single_createattr_News_id();
			
				single_createattr_News_catalogVersion();
			
		createRelationAttributes(
			"StadiumMatchRelation", 
			false, 

			"stadium", 
			"Stadium", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			false,
			false,
			CollectionType.COLLECTION,
			"matches", 
			"Match", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			false,
			CollectionType.COLLECTION
		);
	
				single_createattr_NotEmptyCuppyConstraint_annotation();
			

	}

	
	public void single_createattr_Stadium_code() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"code",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stadium_capacity() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"capacity",  
					null,
					"java.lang.Integer",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stadium_StadiumType() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"StadiumType",  
					null,
					"StadiumType",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_Stadium_stadiumImage() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"Stadium", 
					"stadiumImage",  
					null,
					"MediaContainer",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_NotEmptyCuppyConstraint_annotation() throws JaloBusinessException
	{
		
				redeclareAttribute(
					"NotEmptyCuppyConstraint", 
					"annotation",
					"java.lang.Class",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG
				);
			
	}
	
	public void single_createattr_MatchBet_matchScore() throws JaloBusinessException
	{
		
				createDynamicAttribute(
					"MatchBet", 
					"matchScore",  
					"java.lang.Integer",
					null,
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG
				);
			
	}
	
	public void single_createattr_News_id() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"News", 
					"id",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_News_catalogVersion() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"News", 
					"catalogVersion",  
					null,
					"CatalogVersion",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.INITIAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
		createEnumerationValues(
			"StadiumType",
			false,
			Arrays.asList( new String[] {
			
				"openair",
				"enclosed"
			} )
		);
	
		createEnumerationValues(
			"StadiumAccess",
			true,
			Arrays.asList( new String[] {
			
				"road",
				"rail",
				"plane"
			} )
		);
	
		single_setRelAttributeProperties_StadiumMatchRelation_source();
	
		single_setRelAttributeProperties_StadiumMatchRelation_target();
	
		connectRelation(
			"StadiumMatchRelation", 
			false, 
			"stadium", 
			"Stadium", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			"matches", 
			"Match", 
			true,
			de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG, 
			true,
			true
		);
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"Stadium",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_Stadium_code();
		
			single_setAttributeProperties_Stadium_capacity();
		
			single_setAttributeProperties_Stadium_StadiumType();
		
			single_setAttributeProperties_Stadium_stadiumImage();
		
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"NotEmptyCuppyConstraint",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_NotEmptyCuppyConstraint_annotation();
		
				{
				Map customPropsMap = new HashMap();
				
				changeMetaType(
					"MatchBet",
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_MatchBet_matchScore();
		
				{
				Map customPropsMap = new HashMap();
				
					customPropsMap.put( "catalogItemType", java.lang.Boolean.TRUE );
				
					customPropsMap.put( "catalogVersionAttributeQualifier", "catalogVersion" );
				
					customPropsMap.put( "uniqueKeyAttributeQualifier", "id" );
				
				changeMetaType(
					"News",
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_News_id();
		
			single_setAttributeProperties_News_catalogVersion();
		
				setDefaultProperties(
					"StadiumType",
					true,
					true,
					null
				);
			
				setDefaultProperties(
					"StadiumAccess",
					true,
					true,
					null
				);
			
	}


		
						public void single_setAttributeProperties_Stadium_code() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"code",
								true, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stadium_capacity() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"capacity",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stadium_StadiumType() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"StadiumType",
								false, 
								em().getEnumerationValue("StadiumType","openair"),
								"em().getEnumerationValue(\"StadiumType\",\"openair\")",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_Stadium_stadiumImage() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"Stadium", 
								"stadiumImage",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_NotEmptyCuppyConstraint_annotation() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"NotEmptyCuppyConstraint", 
								"annotation",
								false, 
								
						de.hybris.platform.cuppytrail.constraints.NotEmptyCuppy.class
					,
								"de.hybris.platform.cuppytrail.constraints.NotEmptyCuppy.class",
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_MatchBet_matchScore() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"MatchBet", 
								"matchScore",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								"matchBetScoreAttributeHandler"
							);
						}
					
						public void single_setAttributeProperties_News_id() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"News", 
								"id",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_News_catalogVersion() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"News", 
								"catalogVersion",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
								public void single_setRelAttributeProperties_StadiumMatchRelation_source() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Match", 
										"stadium",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
								public void single_setRelAttributeProperties_StadiumMatchRelation_target() throws JaloBusinessException
								{
									
									Map customPropsMap = new HashMap();
									

									setAttributeProperties(
										"Stadium", 
										"matches",
										false, 
										null,
										null,
										null,
										true,
										true,
										null,
										customPropsMap,
										null
									);
								}
							
}

	