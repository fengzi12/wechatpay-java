// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** StockUseRule */
public class StockUseRule {
  /** 发放总上限 说明：最大发券数 */
  @SerializedName("max_coupons")
  private Long maxCoupons;
  /** 总预算 说明：总消耗金额，单位分 */
  @SerializedName("max_amount")
  private Long maxAmount;
  /** 单天发放上限金额 说明：单天最高消耗金额，单位分 */
  @SerializedName("max_amount_by_day")
  private Long maxAmountByDay;
  /** 固定面额批次特定信息 说明：固定面额发券批次特定信息 */
  @SerializedName("fixed_normal_coupon")
  private FixedValueStockMsg fixedNormalCoupon;
  /** 单个用户可领个数 说明：单个用户可领个数 */
  @SerializedName("max_coupons_per_user")
  private Integer maxCouponsPerUser;
  /** 券类型 说明：NORMAL-满减券；CUT_TO-减至券 */
  @SerializedName("coupon_type")
  private String couponType;
  /** 订单优惠标记 说明：订单优惠标记 */
  @SerializedName("goods_tag")
  private List<String> goodsTag;
  /** 支付方式 说明：默认不限制，可设置以下各种组合方式 1、付款码支付 2、小程序支付 3、其他支付 4、付款码支付&小程序支付 5、付款码支付&其他支付 */
  @SerializedName("trade_type")
  private List<TradeType> tradeType;
  /** 是否可叠加其他优惠 说明：true-是；false-否 */
  @SerializedName("combine_use")
  private Boolean combineUse;

  public Long getMaxCoupons() {
    return maxCoupons;
  }

  public void setMaxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  public Long getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Long getMaxAmountByDay() {
    return maxAmountByDay;
  }

  public void setMaxAmountByDay(Long maxAmountByDay) {
    this.maxAmountByDay = maxAmountByDay;
  }

  public FixedValueStockMsg getFixedNormalCoupon() {
    return fixedNormalCoupon;
  }

  public void setFixedNormalCoupon(FixedValueStockMsg fixedNormalCoupon) {
    this.fixedNormalCoupon = fixedNormalCoupon;
  }

  public Integer getMaxCouponsPerUser() {
    return maxCouponsPerUser;
  }

  public void setMaxCouponsPerUser(Integer maxCouponsPerUser) {
    this.maxCouponsPerUser = maxCouponsPerUser;
  }

  public String getCouponType() {
    return couponType;
  }

  public void setCouponType(String couponType) {
    this.couponType = couponType;
  }

  public List<String> getGoodsTag() {
    return goodsTag;
  }

  public void setGoodsTag(List<String> goodsTag) {
    this.goodsTag = goodsTag;
  }

  public List<TradeType> getTradeType() {
    return tradeType;
  }

  public void setTradeType(List<TradeType> tradeType) {
    this.tradeType = tradeType;
  }

  public Boolean getCombineUse() {
    return combineUse;
  }

  public void setCombineUse(Boolean combineUse) {
    this.combineUse = combineUse;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockUseRule {\n");
    sb.append("    maxCoupons: ").append(toIndentedString(maxCoupons)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    maxAmountByDay: ").append(toIndentedString(maxAmountByDay)).append("\n");
    sb.append("    fixedNormalCoupon: ").append(toIndentedString(fixedNormalCoupon)).append("\n");
    sb.append("    maxCouponsPerUser: ").append(toIndentedString(maxCouponsPerUser)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    goodsTag: ").append(toIndentedString(goodsTag)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    combineUse: ").append(toIndentedString(combineUse)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}