/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 213528451;

	/**
	 * The singleton instance of dbo.t_language
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.ase.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The table column <code>dbo.t_language.cd</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR, T_LANGUAGE);

	/**
	 * The table column <code>dbo.t_language.description</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, T_LANGUAGE);

	/**
	 * The table column <code>dbo.t_language.description_english</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR, T_LANGUAGE);

	/**
	 * The table column <code>dbo.t_language.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("t_language", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.T_LANGUAGE__PK_T_LANGUAGE);
	}
}
