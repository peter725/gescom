import {SimpleModel, StatefulAltModel} from "@libs/sdk/common";

export interface PhaseCampaign extends SimpleModel,StatefulAltModel{

  phase: string;
  description: string;

}

export interface PhaseCampaignForm {
  id: number | null;
  phase: string | null;
  description: string | null;
}