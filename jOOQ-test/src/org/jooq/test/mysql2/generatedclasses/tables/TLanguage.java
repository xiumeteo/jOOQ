/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TLanguage extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1876107987;

	/**
	 * The singleton instance of <code>test2.t_language</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.mysql2.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>test2.t_language.CD</code>. The language ISO code
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2), this);

	/**
	 * The column <code>test2.t_language.DESCRIPTION</code>. The language description
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>test2.t_language.description_english</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>test2.t_language.ID</code>. The language ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>test2.t_language</code> table reference
	 */
	public TLanguage() {
		super("t_language", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.t_language</code> table reference
	 */
	public TLanguage(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_T_LANGUAGE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.TLanguage as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.TLanguage(alias);
	}
}
