package org.colorcoding.ibas.approvalprocess.bo.approvaltemplate;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.colorcoding.ibas.approvalprocess.MyConfiguration;
import org.colorcoding.ibas.bobas.bo.BusinessObjects;

/**
 * 审批模板步骤 集合
 */
@XmlType(name = ApprovalTemplateSteps.BUSINESS_OBJECT_NAME, namespace = MyConfiguration.NAMESPACE_BO)
@XmlSeeAlso({ ApprovalTemplateStep.class })
public class ApprovalTemplateSteps extends BusinessObjects<IApprovalTemplateStep, IApprovalTemplate>
		implements IApprovalTemplateSteps {

	/**
	 * 业务对象名称
	 */
	public static final String BUSINESS_OBJECT_NAME = "ApprovalTemplateSteps";

	/**
	 * 序列化版本标记
	 */
	private static final long serialVersionUID = -6849929090861913562L;

	/**
	 * 构造方法
	 */
	public ApprovalTemplateSteps() {
		super();
	}

	/**
	 * 构造方法
	 * 
	 * @param parent
	 *            父项对象
	 */
	public ApprovalTemplateSteps(IApprovalTemplate parent) {
		super(parent);
	}

	/**
	 * 元素类型
	 */
	public Class<?> getElementType() {
		return ApprovalTemplateStep.class;
	}

	/**
	 * 创建审批模板步骤
	 * 
	 * @return 审批模板步骤
	 */
	public IApprovalTemplateStep create() {
		IApprovalTemplateStep item = new ApprovalTemplateStep();
		if (this.add(item)) {
			return item;
		}
		return null;
	}

}
